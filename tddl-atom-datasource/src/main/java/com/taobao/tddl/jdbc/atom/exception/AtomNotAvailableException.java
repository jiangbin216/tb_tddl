/*(C) 2007-2012 Alibaba Group Holding Limited.	

import java.sql.SQLException;

/**
 * Atom��ͨ��ExceptionSorter��⵽����Դ������ʱ�׳���
 * �������ݿⲻ���ã�ͬʱû��trylock�����Ի���ʱҲ�׳�
 * ����group������
 * 
 * 
 * @author linxuan
 *
 */
public class AtomNotAvailableException extends SQLException {
	private static final long serialVersionUID = 1L;

	public AtomNotAvailableException() {
		super();
	}

	public AtomNotAvailableException(String msg) {
		super(msg);
	}

	public AtomNotAvailableException(String reason, String SQLState) {
		super(reason, SQLState);
	}

	public AtomNotAvailableException(String reason, String SQLState, int vendorCode) {
		super(reason, SQLState, vendorCode);
	}

}