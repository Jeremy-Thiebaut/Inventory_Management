package unityx.projects.entities.roles;

import unityx.projects.entities.MySQLModelRepository;

import java.sql.SQLException;

// Created by Unityx. All rights reserved

public class RoleRepository extends MySQLModelRepository<Role>
{
	public RoleRepository() throws SQLException
	{
		super(Role.class);
	}
}
