package Java_ShiLi.Text132;

public class Bank {
    private int account = 100;// �����˻��ĳ�ʼ�����100
    
    public void deposit(int money) {// ���˻���Ǯ�ķ���
        account += money;
    }
    
    public int getAccount() {// ����˻����ķ���
        return account;
    }
}