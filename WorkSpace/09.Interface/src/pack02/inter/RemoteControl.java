package pack02.inter;

public interface RemoteControl {
	//�����, �ڷ����� ���� �� ����� ������ �����ϰ� �����
	//���� on/off
	//���� up/down
	int MIN_VOLUME=0; //���:�빮�ڷ� �Է�
	int MAX_VOLUME=10;
	//�߻�޼ҵ�
	void turnOn(); //���� Ű��
	
	void turnOff(); //���� ����
	
	void setVolume(int volume);
}
