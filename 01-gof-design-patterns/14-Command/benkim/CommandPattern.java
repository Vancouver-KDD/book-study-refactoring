package leetcode.commandPattern;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


// 커맨드 패턴은 명령을 나타내는 클래스의 인스턴스를 하나로 표현하는 방법이다

public class CommandPattern {
    public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener {

        // 그리기 이력
        private MacroCommand history = new MacroCommand();
        // 그리기 영역
        private DrawCanvas canvas = new DrawCanvas(400, 400, history);
        // 실행 취소 버튼
        private JButton undoButton = new JButton("undo");
        // 지우기 버튼
        private JButton clearButton = new JButton("clear");
    
        public Main(String title) {
            super(title);
    
            this.addWindowListener(this);
            canvas.addMouseMotionListener(this);
            undoButton.addActionListener(this);
            clearButton.addActionListener(this);
    
            Box buttonBox = new Box(BoxLayout.X_AXIS);
            buttonBox.add(undoButton);
            buttonBox.add(clearButton);
            Box mainBox = new Box(BoxLayout.Y_AXIS);
            mainBox.add(buttonBox);
            mainBox.add(canvas);
            getContentPane().add(mainBox);
    
            pack();
            setVisible(true);
        }
    
        // ActionListener 용
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();
            if (source == undoButton) {
                history.undo();
                canvas.repaint();
            } else if (source == clearButton) {
                history.clear();
                canvas.repaint();
            }
        }
    
        // MouseMotionListener用
        public void mouseMoved(MouseEvent e) {
        }
    
        public void mouseDragged(MouseEvent e) {
            Command cmd = new DrawCommand(canvas, e.getPoint());
            history.append(cmd);
            cmd.execute();
        }
    
        // WindowListener 용
        public void windowClosing(WindowEvent e) {
        }
    
        public void windowActivated(WindowEvent e) {
        }
    
        public void windowClosed(WindowEvent e) {
        }
    
        public void windowDeactivated(WindowEvent e) {
        }
    
        public void windowDeiconified(WindowEvent e) {
        }
    
        public void windowIconified(WindowEvent e) {
        }
    
        public void windowOpened(WindowEvent e) {
        }
    
        
    }
}
