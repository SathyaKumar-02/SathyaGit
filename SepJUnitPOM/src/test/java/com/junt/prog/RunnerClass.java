package com.junt.prog;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
//@SuiteClasses(Sample.class) //To execute Single class
@SuiteClasses({Sample.class, AdactinSample.class})
public class RunnerClass {

}
