package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	private int size = 0;

	@Override
	public boolean add(T item) {
		if (size == items.length) {
			int newArrayLength = items.length * 2;
			Object[] newArray = new Object[newArrayLength];
			System.arraycopy(items, 0, newArray, 0, size);
			items = newArray;
		}
		items[size] = item;
		size++;
		return true;
	}

	@Override
	public int getSize() {
		return size;

	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		return (T) items[index];
	}

}
