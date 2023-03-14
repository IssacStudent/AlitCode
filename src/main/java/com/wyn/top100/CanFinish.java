package com.wyn.top100;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 你这个学期必须选修 numCourses 门课程，记为 0 到 numCourses - 1 。
 *
 * 在选修某些课程之前需要一些先修课程。 先修课程按数组 prerequisites 给出，其中 prerequisites[i] = [ai, bi] ，表示如果要学习课程 ai 则 必须 先学习课程  bi 。
 *
 * 例如，先修课程对 [0, 1] 表示：想要学习课程 0 ，你需要先完成课程 1 。
 * 请你判断是否可能完成所有课程的学习？如果可以，返回 true ；否则，返回 false 。
 *
 * @author Yining Wang
 * @date 2023年3月14日21:51:58
 * @since <pre>2023/03/14</pre>
 */
public class CanFinish {
    Set<Integer> courses;
    Map<Integer, Set<Integer>> dependency;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        courses = new HashSet<>();
        for (int i = 0; i < numCourses; i++) {
            courses.add(i);
        }
        dependency = new HashMap<>();
        for (int[] prerequisite : prerequisites) {
            if (dependency.containsKey(prerequisite[0])) {
                Set<Integer> integers = dependency.get(prerequisite[0]);
                integers.add(prerequisite[1]);
            } else {
                Set<Integer> integers = new HashSet<>();
                integers.add(prerequisite[1]);
                dependency.put(prerequisite[0], integers);
            }
        }
        Set<Integer> keys = dependency.keySet();
        while (true) {
            int i = -1;
            for (Integer cours : courses) {
                if (!keys.contains(cours)) {
                    i = cours;
                }
            }
            if (i == -1) {
                return false;
            } else {
                courses.remove(i);
                for (Integer integer : keys) {
                    dependency.get(integer).remove(i);
                }
                keys = dependency.keySet()
                        .stream().filter(ii -> dependency.get(ii).size() != 0)
                        .collect(Collectors.toSet());
            }
            if (courses.size() == 0) {
                return true;
            }
        }
    }
}
