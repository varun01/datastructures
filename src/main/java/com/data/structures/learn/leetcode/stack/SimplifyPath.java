package com.data.structures.learn.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * You are given an absolute path for a Unix-style file system, which always begins with a slash '/'. Your task is to transform this absolute path into its simplified canonical path.
 * <p>
 * The rules of a Unix-style file system are as follows:
 * <p>
 * A single period '.' represents the current directory.
 * A double period '..' represents the previous/parent directory.
 * Multiple consecutive slashes such as '//' and '///' are treated as a single slash '/'.
 * Any sequence of periods that does not match the rules above should be treated as a valid directory or file name. For example, '...' and '....' are valid directory or file names.
 * The simplified canonical path should follow these rules:
 * <p>
 * The path must start with a single slash '/'.
 * Directories within the path must be separated by exactly one slash '/'.
 * The path must not end with a slash '/', unless it is the root directory.
 * The path must not have any single or double periods ('.' and '..') used to denote current or parent directories.
 * Return the simplified canonical path.
 * <p>
 * Example 1:
 * Input: path = "/home/"
 * Output: "/home"
 * <p>
 * Explanation:
 * The trailing slash should be removed.
 * <p>
 * Example 2:
 * Input: path = "/home//foo/"
 * Output: "/home/foo"
 * <p>
 * Explanation:
 * Multiple consecutive slashes are replaced by a single one.
 */
public class SimplifyPath {

    public static void main(String[] args) {
        System.out.println(simplifyPath("/home/user/Documents/../Pictures"));
    }

    public static String simplifyPath(String path) {
        String[] tokens = path.split("/");
        Deque<String> paths = new ArrayDeque<>();
        for(String token: tokens) {
            if((token.length() == 1 && token.charAt(0) != '.')) {
                paths.offerLast(token);
            } else if (token.equals("..") && !paths.isEmpty()) {
                paths.pollLast();
            } else if(token.length() > 1 && !token.equals("..")){
                paths.offerLast(token);
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!paths.isEmpty()) {
            sb.append("/").append(paths.pollFirst());
        }
        if(sb.isEmpty())
            sb.append("/");
        return sb.toString();
    }
}
