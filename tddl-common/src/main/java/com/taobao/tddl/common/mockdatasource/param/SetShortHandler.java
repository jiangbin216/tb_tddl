/*(C) 2007-2012 Alibaba Group Holding Limited.	

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SetShortHandler implements ParameterHandler {
	public void setParameter(PreparedStatement stmt, Object[] args)
			throws SQLException {
		stmt.setShort((Integer) args[0], (Short) args[1]);
	}
}