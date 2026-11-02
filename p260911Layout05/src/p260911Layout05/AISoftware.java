package p260911Layout05;

import javax.swing.*;
import java.awt.*;

public class AISoftware extends JFrame {

    public AISoftware() {
        // 프레임 기본 설정
        setTitle("계산기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 300);
        setLocationRelativeTo(null); // 화면 중앙에 배치
        setLayout(new BorderLayout(5, 5)); // 여백 설정

        // 1. 상단 입력/결과 표시창 (JTextField)
        JTextField display = new JTextField("0.");
        display.setEditable(false); // 수정 불가
        display.setHorizontalAlignment(JTextField.LEFT); // 왼쪽 정렬
        display.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
        display.setBackground(Color.WHITE);
        
        // 상단 패널 생성 후 display 추가 (여백 추가)
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        topPanel.add(display, BorderLayout.CENTER);
        add(topPanel, BorderLayout.NORTH);

        // 2. 버튼 배치 패널 (5행 5열 GridLayout)
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 5, 3, 3)); // 5행 5열, 버튼 간격 3px
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(0, 5, 5, 5));

        // 버튼 라벨 배열 (5x5)
        String[] buttons = {
            "Backspace", "", "", "CE", "C",
            "7", "8", "9", "/", "sqrt",
            "4", "5", "6", "x", "%",
            "1", "2", "3", "-", "1/x",
            "0", "+/-", ".", "+", "="
        };

        // 스타일 설정
        Color yellowColor = new Color(255, 255, 0); // 노란색 배경
        Color blueFontColor = new Color(0, 0, 150);  // 숫자/일부 버튼 글자색(파란계열)
        Color redFontColor = Color.RED;             // 연산자 버튼 글자색(빨간색)

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setBackground(yellowColor);
            btn.setOpaque(true);
            btn.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
            btn.setFont(new Font("맑은 고딕", Font.BOLD, 14));

            // 글자 색상 구분 설정
            if (isRedOperator(text)) {
                btn.setForeground(redFontColor);
            } else {
                btn.setForeground(blueFontColor);
            }

            buttonPanel.add(btn);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    // 빨간색 글씨로 표시될 연산자/특수버튼 구분 함수
    private boolean isRedOperator(String text) {
        return text.equals("CE") || text.equals("C") || text.equals("/") || 
               text.equals("sqrt") || text.equals("x") || text.equals("%") || 
               text.equals("-") || text.equals("1/x") || text.equals("+") || 
               text.equals("=");
    }

    public static void main(String[] args) {
        // Swing GUI 쓰레드 실행
        SwingUtilities.invokeLater(() -> {
            AISoftware calc = new AISoftware();
            calc.setVisible(true);
        });
    }
}