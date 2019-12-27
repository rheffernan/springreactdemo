/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.greglturnquist.payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Greg Turnquist
 */
// tag::code[]
@SpringBootApplication
@SuppressWarnings({"PMD.ClassWithOnlyPrivateConstructorsShouldBeFinal","PMD.UseUtilityClass"})
public class ReactAndSpringDataRestApplication {

//	private ReactAndSpringDataRestApplication() {
//		//needed a private constructor to please PMD (since all methods are static)
//	}


	public static void main(String[] args) {
		SpringApplication.run(ReactAndSpringDataRestApplication.class, args);
	}
}
// end::code[]