/*
 * Decompiled with CFR 0.152.
 */
import java.net.InetSocketAddress;

public interface hjv {
    public String a();

    public String b();

    public int c();

    public InetSocketAddress d();

    public static hjv a(final InetSocketAddress $$0) {
        return new hjv(){

            @Override
            public String a() {
                return $$0.getAddress().getHostName();
            }

            @Override
            public String b() {
                return $$0.getAddress().getHostAddress();
            }

            @Override
            public int c() {
                return $$0.getPort();
            }

            @Override
            public InetSocketAddress d() {
                return $$0;
            }
        };
    }
}

