package dev.hemanth.jfs.corelanguage;

public class StringBuilderPerformance {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            sb.append(i);
        }

        System.out.println(sb);
    }
}