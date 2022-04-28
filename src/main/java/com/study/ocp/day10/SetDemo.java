package com.study.ocp.day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		Set set = new HashSet();
		set.add("國文");
		set.add(100);
		set.add("數學");
		set.add(90);
		set.add("英文");
		set.add(80);
		// [80, 100, 國文, 英文, 90, 數學]
		System.out.println(set);

		// 總分 = ?
		int sum = 0;
		int sum2 = 0;
		Iterator iter = set.iterator();

		// 尋訪每一個元素
		while (iter.hasNext()) {
			Object object = iter.next();
			System.out.printf("%s %s\n", object, object == null ? null : object.getClass());

			// 將 null 移除
			if (object == null) {
				iter.remove();
			}

			// 將 Integer 的元素過濾出並相加
			if (object != null && object.getClass() == Integer.class) {
				sum += (Integer) object;
			}

			// 利用 instanceof 來判斷型別
			if (object instanceof Integer) {
				sum2 += (Integer) object;
			}
		}
		System.out.println(set);
		System.out.println(sum);
		System.out.println(sum2);
	}
}
