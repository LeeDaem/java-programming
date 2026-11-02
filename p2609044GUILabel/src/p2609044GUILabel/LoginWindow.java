package p2609044GUILabel;

import javax.swing.*;
import java.awt.*;

public class LoginWindow extends JFrame {

    public LoginWindow() {
        // 프레임 기본 설정
        setTitle("login window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 180);
        setLocationRelativeTo(null); // 화면 중앙에 배치
        setResizable(false);

        // 메인 패널 설정 (BorderLayout 사용)
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15)); // 여백 설정

        // 1. 입력 필드 패널 (레이블 + 텍스트 필드)
        JPanel inputPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // 요소 간 간격
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // "id" 레이블
        JLabel idLabel = new JLabel("id");
        idLabel.setFont(new Font("Arial", Font.BOLD, 12));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.1;
        inputPanel.add(idLabel, gbc);

        // "id" 텍스트 필드
        JTextField idField = new JTextField("id", 15);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 0.9;
        inputPanel.add(idField, gbc);

        // "pass" 레이블
        JLabel passLabel = new JLabel("pass");
        passLabel.setFont(new Font("Arial", Font.BOLD, 12));
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0.1;
        inputPanel.add(passLabel, gbc);

        // "pass" 암호 필드
        JPasswordField passField = new JPasswordField(15);
        passField.setText("****"); // 예시 비밀번호 표시
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 0.9;
        inputPanel.add(passField, gbc);

        // 2. 버튼 패널 (login, cancel)
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        JButton loginButton = new JButton("login");
        JButton cancelButton = new JButton("cancel");

        loginButton.setFont(new Font("Arial", Font.BOLD, 12));
        cancelButton.setFont(new Font("Arial", Font.BOLD, 12));

        buttonPanel.add(loginButton);
        buttonPanel.add(cancelButton);

        // 메인 패널에 컴포넌트 추가
        mainPanel.add(inputPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // 프레임에 메인 패널 추가
        add(mainPanel);
    }

    public static void main(String[] args) {
        // Swing GUI는 Event Dispatch Thread에서 실행
        SwingUtilities.invokeLater(() -> {
            new LoginWindow().setVisible(true);
        });
    }
}
