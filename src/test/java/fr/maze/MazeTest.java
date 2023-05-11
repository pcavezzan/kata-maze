package fr.maze;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MazeTest {

    @Test
    void test_maze_generation() {
        final var maze  = new Maze();

        String run = maze.run();

        Assertions.fail("does not same output");
    }
}
