package chapter04.concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * @author jiecheng
 * @create 2019-11-03 上午10:15
 */
@Aspect
public class EncoreableIntroducer {

    @DeclareParents(value = "chapter04.concert.Performance+",
            defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
