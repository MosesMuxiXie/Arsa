/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 */
import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface byx
extends byn<StringReader> {
    public Stream<amo> a();

    @Override
    default public Stream<String> possibleValues(byk<StringReader> $$0) {
        return this.a().map(amo::toString);
    }
}

