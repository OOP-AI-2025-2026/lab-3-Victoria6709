package org.example.task2;

import java.util.Arrays;

public class Cart {

    private final Item[] contents;
    private int index;

    public Cart(Item[] contents) {
        this.contents = contents;
        this.index = 0;
    }

    public void add(Item item) {
        if (this.isFull()) return;
        this.contents[this.index] = item;
        this.index++;
    }

    public void removeByArrayIndex(int arrayIndex) {
        if (this.index == 0 || arrayIndex < 0 || arrayIndex >= this.index) return;
        int foundIndex = this.findItemIndex(this.contents[arrayIndex]);
        if (foundIndex == -1) return;
        if (foundIndex == this.index - 1) {
            this.contents[foundIndex] = null;
        } else {
            this.shiftLeft(foundIndex);
        }

        this.index--;
    }

    private void shiftLeft(int fromIndex) {
        for (int i = fromIndex; i < this.index - 1; i++) {
            this.contents[i] = this.contents[i + 1];
        }
        this.contents[this.index - 1] = null;
    }

    private int findItemIndex(Item item) {
        for (int i = 0; i < this.index; i++) {
            if (this.contents[i].getId() == item.getId()) {
                return i;
            }
        }
        return -1;
    }

    public boolean isFull() {
        return this.index == this.contents.length;
    }

    public Item[] getItems() {
        return Arrays.copyOf(this.contents, this.index); // Повертаємо лише додані елементи
    }

    @Override
    public String toString() {
        return "Cart{" +
                "contents=" + Arrays.toString(this.getItems()) +
                "}\n";
    }
}
