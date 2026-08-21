/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.commons.io.IOUtils
 */
import com.google.common.collect.Lists;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.io.IOUtils;

public class fzy {
    public static List<gbr> a(a ... $$0) {
        for (a $$1 : $$0) {
            fzy.a($$1.j);
        }
        ArrayList $$2 = Lists.newArrayList();
        for (a $$3 : $$0) {
            $$2.add(new gbr($$3.i, fzy.a($$3.j)));
        }
        $$2.sort(Comparator.comparingInt(gbr::b));
        return $$2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static int a(String $$0) {
        int $$1 = 700;
        long $$2 = 0L;
        Socket $$3 = null;
        for (int $$4 = 0; $$4 < 5; ++$$4) {
            try {
                InetSocketAddress $$5 = new InetSocketAddress($$0, 80);
                $$3 = new Socket();
                long $$6 = fzy.b();
                $$3.connect($$5, 700);
                $$2 += fzy.b() - $$6;
                IOUtils.closeQuietly((Socket)$$3);
                continue;
            }
            catch (Exception $$7) {
                $$2 += 700L;
                continue;
            }
            finally {
                IOUtils.closeQuietly($$3);
            }
        }
        return (int)((double)$$2 / 5.0);
    }

    private static long b() {
        return bhs.c();
    }

    public static List<gbr> a() {
        return fzy.a(a.values());
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("us-east-1", "ec2.us-east-1.amazonaws.com");
        public static final /* enum */ a b = new a("us-west-2", "ec2.us-west-2.amazonaws.com");
        public static final /* enum */ a c = new a("us-west-1", "ec2.us-west-1.amazonaws.com");
        public static final /* enum */ a d = new a("eu-west-1", "ec2.eu-west-1.amazonaws.com");
        public static final /* enum */ a e = new a("ap-southeast-1", "ec2.ap-southeast-1.amazonaws.com");
        public static final /* enum */ a f = new a("ap-southeast-2", "ec2.ap-southeast-2.amazonaws.com");
        public static final /* enum */ a g = new a("ap-northeast-1", "ec2.ap-northeast-1.amazonaws.com");
        public static final /* enum */ a h = new a("sa-east-1", "ec2.sa-east-1.amazonaws.com");
        final String i;
        final String j;
        private static final /* synthetic */ a[] k;

        public static a[] values() {
            return (a[])k.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, String $$1) {
            this.i = $$0;
            this.j = $$1;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e, f, g, h};
        }

        static {
            k = fzy$a.a();
        }
    }
}

