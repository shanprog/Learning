package ch_13.home.lst_15;

import java.math.BigInteger;

public class Rational extends Number implements Comparable<Rational> {

    private BigInteger numerator = BigInteger.ZERO;
    private BigInteger denominator = BigInteger.ONE;


    public Rational() {
        this(BigInteger.ZERO, BigInteger.ONE);
    }

    public Rational(BigInteger numerator, BigInteger denominator) {

        BigInteger gcd = gcd(numerator, denominator);
        this.numerator = ((denominator.compareTo(BigInteger.ZERO) > 0) ? BigInteger.ONE : BigInteger.ONE.not()).multiply(numerator).divide(gcd);
        this.denominator = denominator.abs().divide(gcd);
    }


    public Rational(long numerator, long denominator) {

        BigInteger n1 = BigInteger.valueOf(numerator);
        BigInteger n2 = BigInteger.valueOf(denominator);

        BigInteger gcd = gcd(n1, n2);
        this.numerator = ((n2.compareTo(BigInteger.ZERO) > 0) ? BigInteger.ONE : BigInteger.ONE.not()).multiply(n1).divide(gcd);
        this.denominator = n2.abs().divide(gcd);
    }

    private static BigInteger gcd(BigInteger n, BigInteger d) {
        BigInteger n1 = n.abs();
        BigInteger n2 = d.abs();

        BigInteger gcd = BigInteger.valueOf(1);

        for (BigInteger k = BigInteger.ONE; k.compareTo(n1) <= 0 && k.compareTo(n2) <= 0; k.add(BigInteger.ONE)) {
            if ((n1.remainder(k)).compareTo(BigInteger.ZERO) == 0 && (n2.remainder(k)).compareTo(BigInteger.ZERO) == 0) {
                gcd = k;
            }
        }

        return gcd;
    }

    public BigInteger getNumerator() {
        return numerator;
    }

    public BigInteger getDenominator() {
        return denominator;
    }

    public Rational add(Rational secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator()).add(
                denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    public Rational subtract(Rational secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator()).subtract(denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    public Rational multiply(Rational secondRational) {
        BigInteger n = numerator.multiply(secondRational.getNumerator());
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    public Rational divide(Rational secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator());
        BigInteger d = denominator.multiply(secondRational.numerator);
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        if (denominator.compareTo(BigInteger.ONE) == 0)
            return numerator + "";
        else
            return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object obj) {
        return (this.subtract((Rational) (obj))).getNumerator().compareTo(BigInteger.ZERO) == 0;
    }

    @Override
    public int compareTo(Rational o) {
        if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) > 0)
            return 1;
        else if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) < 0)
            return -1;
        else
            return 0;
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator.divide(denominator).doubleValue();
    }
}
