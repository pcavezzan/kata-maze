package fr.maze;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MazeTest {

    @Test
    void test_maze_generation() {
        final var maze  = new Maze(1, 1);

        String run = maze.run();

        Assertions.assertEquals(run, """
                +---+
                |   |
                +---+
                """);
    }
}
