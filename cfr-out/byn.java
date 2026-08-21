/*
 * Decompiled with CFR 0.152.
 */
import java.util.stream.Stream;

public interface byn<S> {
    public Stream<String> possibleValues(byk<S> var1);

    public static <S> byn<S> b() {
        return $$0 -> Stream.empty();
    }
}

