package unityx.projects.entities.permissions;

import unityx.projects.entities.MySQLModelRepository;

import java.sql.SQLException;

// Created by Unityx. All rights reserved

public class PermissionRepository extends MySQLModelRepository<Permission>
{
	public PermissionRepository() throws SQLException
	{
		super(Permission.class);
	}
}
