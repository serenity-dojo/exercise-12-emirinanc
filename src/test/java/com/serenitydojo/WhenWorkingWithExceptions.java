package com.serenitydojo;

import com.serenitydojo.exceptions.FileLoader;
import com.serenitydojo.exceptions.MissingWelcomeFileException;
import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class WhenWorkingWithExceptions {

    // - Handle a declared exception
    // - Catch a declared exception and return a value
    // - Catch a declared exception and throw a custom exception
    // - Custom logic that throws a custom exception when no result is found
    // - Using the Finally block to clean up

    /**
     * Exercise 1 - Handling exceptions
     * Uncomment the code in this test and {@link FileLoader} and make it work.
     * You will need to modify the FileLoader class so that it correctly handles an IOException
     */
    @Test (expected = IOException.class)
    public void workingWithDeclaredExceptions() throws IOException {
        FileLoader fileLoader = new FileLoader();
        assertThat(fileLoader.readHelloWorld()).isEqualTo("Hello World");
    }

    /**
     * Exercise 2 - Catching exceptions
     * Update the fileContainsText() method in the FileLoader class so that it returns false if the file
     * does not contain the excepted text, or if the file does not exist.
     */
    @Test
    public void catchingExceptions() {
        FileLoader fileLoader = new FileLoader();
        assertThat(fileLoader.fileContainsText("hello.txt","Hello World")).isTrue();
    }

    @Test
    public void catchingExceptionsWhenTheFileDoesNotExist() {
        FileLoader fileLoader = new FileLoader();
        assertThat(fileLoader.fileContainsText("does-not-exist.txt","Hello World")).isFalse();
    }

    /**
     * Exercise 3 - Throwing custom exceptions
     * Create a custom runtime exception called MissingWelcomeFileException,
     * and update the fileHasText() method to throw this exception if no matching file is found.
     */
    @Test
    public void catchingCustomExceptionsWhenTheFileDoesNotExist() {
        FileLoader fileLoader = new FileLoader();
        assertThatThrownBy(() -> {
            assertThat(fileLoader.fileHasText("does-not-exist.txt","Hello World")).isFalse();
        }).isInstanceOf(MissingWelcomeFileException.class);

    }
}
