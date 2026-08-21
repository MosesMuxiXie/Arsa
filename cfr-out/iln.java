/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Locale;

public class iln
extends RuntimeException {
    private final Collection<ilm.a> a;

    public iln(ilm.a $$0, Collection<ilm.a> $$1) {
        super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.d(), $$0.b(), $$0.c()));
        this.a = $$1;
    }

    public Collection<ilm.a> a() {
        return this.a;
    }
}

