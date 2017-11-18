import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CellTests {
    @Test
    public void aliveCell_whenHasTwoNeighbours_shouldBeAlive() {
        Cell cell = new Cell(CellState.ALIVE);

        cell.getNeighbours().put(CellDirection.N, new Cell(CellState.ALIVE));
        cell.getNeighbours().put(CellDirection.S, new Cell(CellState.ALIVE));

        Assert.assertTrue(CellState.ALIVE.equals(cell.nextState()));
    }

    @Test
    public void aliveCell_whenHasThreeNeighbours_shouldBeAlive() {
        Cell cell = new Cell(CellState.ALIVE);

        cell.getNeighbours().put(CellDirection.N, new Cell(CellState.ALIVE));
        cell.getNeighbours().put(CellDirection.S, new Cell(CellState.ALIVE));
        cell.getNeighbours().put(CellDirection.W, new Cell(CellState.ALIVE));

        Assert.assertTrue(CellState.ALIVE.equals(cell.nextState()));
    }

    @Test
    public void aliveCell_whenHasFourNeighbours_shouldBeDead() {
        Cell cell = new Cell(CellState.ALIVE);

        cell.getNeighbours().put(CellDirection.N, new Cell(CellState.ALIVE));
        cell.getNeighbours().put(CellDirection.S, new Cell(CellState.ALIVE));
        cell.getNeighbours().put(CellDirection.W, new Cell(CellState.ALIVE));
        cell.getNeighbours().put(CellDirection.E, new Cell(CellState.ALIVE));

        Assert.assertTrue(CellState.DEAD.equals(cell.nextState()));
    }

    @Test
    public void deadCell_whenHasThreeNeighbours_shouldBeAlive() {
        Cell cell = new Cell(CellState.DEAD);

        cell.getNeighbours().put(CellDirection.N, new Cell(CellState.ALIVE));
        cell.getNeighbours().put(CellDirection.S, new Cell(CellState.ALIVE));
        cell.getNeighbours().put(CellDirection.W, new Cell(CellState.ALIVE));

        Assert.assertTrue(CellState.ALIVE.equals(cell.nextState()));
    }

    @Test
    public void deadCell_whenHasTwoNeighbours_shouldBeDead() {
        Cell cell = new Cell(CellState.DEAD);

        cell.getNeighbours().put(CellDirection.N, new Cell(CellState.ALIVE));
        cell.getNeighbours().put(CellDirection.S, new Cell(CellState.ALIVE));

        Assert.assertTrue(CellState.DEAD.equals(cell.nextState()));
    }
}
