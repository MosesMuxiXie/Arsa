/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.net.URI;
import java.nio.file.Path;
import java.util.Optional;

public record ww(yh a, Optional<Path> b, Optional<URI> c) {
    public ww(yh $$0) {
        this($$0, Optional.empty(), Optional.empty());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ww.class, "reason;report;bugReportLink", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ww.class, "reason;report;bugReportLink", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ww.class, "reason;report;bugReportLink", "a", "b", "c"}, this, $$0);
    }
}

