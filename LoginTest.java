package com.project.BugTracker;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.project.BugTracker.Service.LoginService;
import com.project.BugTracker.Entity.LoginEntity;
import com.project.BugTracker.Exception.LoginNotFoundException;

@ExtendWith(MockitoExtension.class)
public class LoginTest {

	@Mock
	LoginService loginService;

	@Test
	void addLoginTest() {
		LoginEntity loginEntity = new LoginEntity("isha@gmail.com", "isha", "user");
		when(loginService.addLogin(loginEntity)).thenReturn(loginEntity);
		assertEquals(loginService.addLogin(loginEntity), loginEntity);
	}

	@Test
	void getLoginTest() throws LoginNotFoundException {
		LoginEntity loginEntity = new LoginEntity("isha@gmail.com", "isha", "user");
		Optional<LoginEntity> OLoginEntity = Optional.of(loginEntity);
		when(loginService.getLogin("isha@gmail.com")).thenReturn(OLoginEntity);
		assertEquals(loginService.getLogin("isha@gmail.com").get(), loginEntity);
	}

	@Test
	void updateLoginTest() throws LoginNotFoundException {
		LoginEntity loginEntity = new LoginEntity("isha@gmail.com", "isha", "user");
		when(loginService.updateLogin("isha@gmail.com", loginEntity)).thenReturn(loginEntity);
		assertEquals(loginService.updateLogin("isha@gmail.com", loginEntity), loginEntity);
	}

	@Test
	void deleteLoginTest() throws LoginNotFoundException {
		LoginEntity loginEntity = new LoginEntity("isha@gmail.com", "isha", "user");
		Optional<LoginEntity> OLoginEntity = Optional.of(loginEntity);
		when(loginService.deleteLogin("isha@gmail.com")).thenReturn(OLoginEntity);
		assertEquals(loginService.deleteLogin("isha@gmail.com").get(), loginEntity);
	}
}
