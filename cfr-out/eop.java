/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class eop
implements Predicate<eoh> {
    private final dzq a;

    public eop(dzq $$0) {
        this.a = $$0;
    }

    public static eop a(dzq $$0) {
        return new eop($$0);
    }

    public boolean a(@Nullable eoh $$0) {
        return $$0 != null && $$0.a(this.a);
    }

    @Override
    public /* synthetic */ boolean test(@Nullable Object object) {
        return this.a((eoh)object);
    }
}

