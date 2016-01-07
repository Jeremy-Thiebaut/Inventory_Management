package unityx.projects.entities.permissions;

// Created by Unityx. All rights reserved

import unityx.projects.entities.BaseEntity;

import javax.persistence.*;

/**
 * A permission indicates access to a resource.
 */
@Entity
@Table(name = "permissions")
public class Permission extends BaseEntity
{
	public static final Permission MANAGE_USERS = new Permission(1, "users.manage");
	public static final Permission MANAGE_ROLES = new Permission(2, "roles.manage");

	@Column
	@Id
	@GeneratedValue
	private long id;
	@Column
	private String name;

	public Permission()
	{
	}

	private Permission(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	public Permission(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
