package com.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamserverApplication  {

	/*
	 * @Autowired private UserService userService;
	 */

	/*
	 * @Autowired private BCryptPasswordEncoder bCryptPasswordEncoder;
	 * 
	 * @Autowired public QuizRepository quizRepository;
	 */

    public static void main(String[] args) {


        SpringApplication.run(ExamserverApplication.class, args);


    }

	/*
	 * @Override public void run(String... args) throws Exception { try {
	 * 
	 * 
	 * System.out.println("starting code"); // User user = new User();
	 * 
	 * user.setFirstName("Subahan"); user.setLastName("Syed");
	 * user.setUsername("Subahan123"); user.setPhone("9346150581");
	 * user.setPassword(this.bCryptPasswordEncoder.encode("123456789"));
	 * user.setEmail("subahansyed20@gmail.com"); user.setProfile("default.png");
	 * 
	 * Role role1 = new Role(); role1.setRoleId(44L); role1.setRoleName("ADMIN");
	 * 
	 * Set<UserRole> userRoleSet = new HashSet<>(); UserRole userRole = new
	 * UserRole();
	 * 
	 * userRole.setRole(role1);
	 * 
	 * userRole.setUser(user);
	 * 
	 * userRoleSet.add(userRole);
	 * 
	 * User user1 = this.userService.createUser(user, userRoleSet);
	 * System.out.println(user1.getUsername());
	 * 
	 * 
	 * } catch (UserFoundException e) { e.printStackTrace();
	 * 
	 * 
	 * }
	 * 
	 * 
	 * }
	 */


}
