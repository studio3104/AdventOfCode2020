package com.studio3104.adventofcode2020.day08;

@lombok.Getter
public class Command {
    private final String operation;
    private final char sign;
    private final int num;

    public Command(String command) {
        String[] c = command.split(" ");
        operation = c[0];
        sign = c[1].charAt(0);
        num = Integer.parseInt(c[1].substring(1));
    }
}
