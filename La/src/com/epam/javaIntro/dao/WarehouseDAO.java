package com.epam.javaIntro.dao;

import com.epam.javaIntro.bean.Position;

public interface WarehouseDAO {
	void save(Position newPosition) throws DAOException;
}
