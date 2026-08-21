/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.lang.management.ManagementFactory;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.DynamicMBean;
import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanAttributeInfo;
import javax.management.MBeanInfo;
import javax.management.MBeanNotificationInfo;
import javax.management.MBeanRegistrationException;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class bxy
implements DynamicMBean {
    private static final Logger a = LogUtils.getLogger();
    private final MinecraftServer b;
    private final MBeanInfo c;
    private final Map<String, a> d = Stream.of(new a("tickTimes", this::b, "Historical tick times (ms)", long[].class), new a("averageTickTime", this::a, "Current average tick time (ms)", Long.TYPE)).collect(Collectors.toMap($$0 -> $$0.a, Function.identity()));

    private bxy(MinecraftServer $$02) {
        this.b = $$02;
        MBeanAttributeInfo[] $$1 = (MBeanAttributeInfo[])this.d.values().stream().map(a::a).toArray(MBeanAttributeInfo[]::new);
        this.c = new MBeanInfo(bxy.class.getSimpleName(), "metrics for dedicated server", $$1, null, null, new MBeanNotificationInfo[0]);
    }

    public static void a(MinecraftServer $$0) {
        try {
            ManagementFactory.getPlatformMBeanServer().registerMBean(new bxy($$0), new ObjectName("net.minecraft.server:type=Server"));
        }
        catch (InstanceAlreadyExistsException | MBeanRegistrationException | MalformedObjectNameException | NotCompliantMBeanException $$1) {
            a.warn("Failed to initialise server as JMX bean", (Throwable)$$1);
        }
    }

    private float a() {
        return this.b.aQ();
    }

    private long[] b() {
        return this.b.aT();
    }

    @Override
    public @Nullable Object getAttribute(String $$0) {
        a $$1 = this.d.get($$0);
        return $$1 == null ? null : $$1.b.get();
    }

    @Override
    public void setAttribute(Attribute $$0) {
    }

    @Override
    public AttributeList getAttributes(String[] $$02) {
        List<Attribute> $$1 = Arrays.stream($$02).map(this.d::get).filter(Objects::nonNull).map($$0 -> new Attribute($$0.a, $$0.b.get())).collect(Collectors.toList());
        return new AttributeList($$1);
    }

    @Override
    public AttributeList setAttributes(AttributeList $$0) {
        return new AttributeList();
    }

    @Override
    public @Nullable Object invoke(String $$0, Object[] $$1, String[] $$2) {
        return null;
    }

    @Override
    public MBeanInfo getMBeanInfo() {
        return this.c;
    }

    static final class a {
        final String a;
        final Supplier<Object> b;
        private final String c;
        private final Class<?> d;

        a(String $$0, Supplier<Object> $$1, String $$2, Class<?> $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        private MBeanAttributeInfo a() {
            return new MBeanAttributeInfo(this.a, this.d.getSimpleName(), this.c, true, false, false);
        }
    }
}

