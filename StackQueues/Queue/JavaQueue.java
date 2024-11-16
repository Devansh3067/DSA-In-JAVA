package StackQueues.Queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class JavaQueue {
    Queue<Integer> q = new Queue<Integer>() {
        @Override
        public boolean add(Integer integer) {
            return false;
        }

        @Override
        public boolean offer(Integer integer) {
            return false;
        }

        @Override
        public Integer remove() {
            return 0;
        }

        @Override
        public Integer poll() {
            return 0;
        }

        @Override
        public Integer element() {
            return 0;
        }

        @Override
        public Integer peek() {
            return 0;
        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Integer> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Integer> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }
    };
}
