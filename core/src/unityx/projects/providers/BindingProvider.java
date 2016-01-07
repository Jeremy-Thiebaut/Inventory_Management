package unityx.projects.providers;

import unityx.projects.auth.AuthRepository;
import unityx.projects.contracts.auth.Authenticator;
import unityx.projects.contracts.auth.Authorizator;
import unityx.projects.contracts.encryption.Hasher;
import unityx.projects.contracts.events.EventBus;
import unityx.projects.contracts.mailing.Mailer;
import unityx.projects.contracts.persistence.IDatabaseRepository;
import unityx.projects.contracts.validation.EmailValidator;
import unityx.projects.contracts.validation.StringValidator;
import unityx.projects.encryption.Sha1Cryptor;
import unityx.projects.events.MBassadorBus;
import unityx.projects.mailing.GMailer;
import unityx.projects.persistence.ModelDatabaseRepository;
import unityx.projects.validation.ValidationRepository;
import com.google.inject.AbstractModule;

// Created by Unityx. All rights reserved

/**
 * Binds all contracts to their respective implementations.
 */
class BindingProvider extends AbstractModule
{
	/**
	 * Configures the bindings.
	 * This method is called by Guice itself.
	 */
	@Override
	protected void configure()
	{
		initAuth();
		initBusses();
		initConnections();
		initValidators();
	}

	private void initAuth()
	{
		AuthRepository authenticator = new AuthRepository();
		bind(Authenticator.class).toInstance(authenticator);
		bind(Authorizator.class).toInstance(authenticator);
		bind(Hasher.class).to(Sha1Cryptor.class);
	}

	private void initBusses()
	{
		bind(EventBus.class).toInstance(new MBassadorBus());
	}

	private void initConnections()
	{
		bind(IDatabaseRepository.class).toInstance(new ModelDatabaseRepository());
	}

	private void initValidators()
	{
		bind(EmailValidator.class).to(ValidationRepository.class);
		bind(StringValidator.class).to(ValidationRepository.class);
		bind(Mailer.class).to(GMailer.class);
	}
}
