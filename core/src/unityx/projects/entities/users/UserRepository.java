package unityx.projects.entities.users;

import unityx.projects.contracts.encryption.Hasher;
import unityx.projects.entities.MySQLModelRepository;

import java.sql.SQLException;

import static unityx.projects.providers.InjectionProvider.resolve;

// Created by Unityx. All rights reserved

public class UserRepository extends MySQLModelRepository<User>
{
	public UserRepository() throws SQLException
	{
		super(User.class);
	}

	@Override
	public void save(User obj) throws SQLException
	{
		if (resolve(Hasher.class).needsRehash(obj.getPassword()))
		{
			obj.setPassword(resolve(Hasher.class).hash(obj.getPassword()));
		}

		super.save(obj);
	}
}
