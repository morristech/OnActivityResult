package onactivityresult;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * parameters of a {@link OnActivityResult} annotated method can be annotated to get a double extra of the Intent<br>
 * Example:<br>
 * <p>
 * <code>
 *     &#64;OnActivityResult(requestCode = 1)
 *     void onResult(&#64;ExtraDouble final double extraDouble) {
 *          // Do something
 *     }
 * </code>
 * </p>
 * <br>
 * defaultValue: 0d<br>
 * extra name: same as parameter <br>
 * NOTE: In this case it would be extraDouble<br>
 *
 * @since 0.3.0
 */
@Retention(CLASS)
@Target(PARAMETER)
public @interface ExtraDouble {}