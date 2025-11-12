import java.awt.*;

/**
 * The {@code KeepAwake} class prevents the computer screen from going to sleep
 * by simulating small mouse movements at fixed time intervals.
 *
 * <p>This can be useful for long-running operations such as monitoring,
 * computation, or presentations where automatic screen sleep is undesirable.</p>
 *
 * <p>Example usage:</p>
 * <pre>{@code
 * javac KeepAwake.java
 * java KeepAwake
 * }</pre>
 *
 * @author  Sasa Wu
 * @version 1.0
 * @since   2025-11-10
 */
public class KeepAwake {

    /**
     * Main entry point of the KeepAwake program.
     *
     * <p>The method creates a {@link Robot} instance that moves the mouse cursor
     * by one pixel every 30 seconds, then moves it back. This prevents the system
     * from entering idle mode or triggering screen sleep.</p>
     *
     * @param args Command-line arguments (not used)
     * @throws Exception if the {@link Robot} initialization fails
     *                   or if {@link Thread#sleep(long)} is interrupted
     */
    public static void main(String[] args) throws Exception {
        Robot robot = new Robot();
        System.out.println("KeepAwake 已啟動。螢幕將保持喚醒狀態。按 Ctrl + C 結束。");

        while (true) {
            // 取得滑鼠目前位置
            Point p = MouseInfo.getPointerInfo().getLocation();
            int x = (int) p.getX();
            int y = (int) p.getY();

            // 模擬滑鼠微移動
            robot.mouseMove(x + 1, y);
            Thread.sleep(60000); // 暫停 60 秒
            robot.mouseMove(x, y);
            Thread.sleep(60000); // 暫停 60 秒
        }
    }
}
