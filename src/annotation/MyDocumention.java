package annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyDocumention {
    String author() default "Magdalena Kurowska";
    String comment();
}
