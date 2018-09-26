package enumerationType;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public enum Computation {
    MULTIPY {
        public double perform(double x, double y) {
            return x * y;
        }
    },
    DIVIDE {
        public double perform(double x, double y) {
            return x/y;
        }
    },
    ADD{
        public double perform(double x, double y) {
            return x+y;
        }
    },
    SUBTRACT{
        public double perform(double x, double y) {
            return x-y;
        }
    };

    public abstract double perform(double x, double y);

    public static void main(String[] args) {
        System.out.println(Computation.ADD.perform(2,8));
    }
}
