/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class bax {
    private final azl a;
    private final bar<InputStream> b;
    private final bar<bbb> c;
    private @Nullable bbb d;

    public bax(azl $$0, bar<InputStream> $$1, bar<bbb> $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    public bax(azl $$0, bar<InputStream> $$1) {
        this.a = $$0;
        this.b = $$1;
        this.c = bbb.b;
        this.d = bbb.a;
    }

    public azl a() {
        return this.a;
    }

    public String b() {
        return this.a.b();
    }

    public Optional<bag> c() {
        return this.a.c();
    }

    public InputStream d() throws IOException {
        return this.b.get();
    }

    public BufferedReader e() throws IOException {
        return new BufferedReader(new InputStreamReader(this.d(), StandardCharsets.UTF_8));
    }

    public bbb f() throws IOException {
        if (this.d == null) {
            this.d = this.c.get();
        }
        return this.d;
    }
}

