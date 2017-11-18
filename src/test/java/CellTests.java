import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CellTests {
    @Test
    public void cell_whenHasTwoNeighbours_shouldBeAlive() {
        Cell cell = new Cell(CellState.ALIVE);

        cell.getNeighbours().put(CellDirection.N, new Cell(CellState.ALIVE));
        cell.getNeighbours().put(CellDirection.S, new Cell(CellState.ALIVE));

        Assert.assertTrue(CellState.ALIVE.equals(cell.nextState()));
    }
}
