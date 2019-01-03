package work;

import jdk.nashorn.api.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main (String[] args) {
        TreeSet<Integer> tree = new TreeSet ();
        tree.add(11);
        tree.add(55);
        tree.add(22);
        tree.add(33);
        tree.add(44);
        System.out.println (tree);
        tree.comparator ();


    }
}
