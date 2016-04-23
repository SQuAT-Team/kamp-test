package de.uka.ipd.sdq.probfunction.print;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import de.uka.ipd.sdq.probfunction.BoxedPDF;
import de.uka.ipd.sdq.probfunction.ContinuousSample;
import de.uka.ipd.sdq.probfunction.ExponentialDistribution;
import de.uka.ipd.sdq.probfunction.GammaDistribution;
import de.uka.ipd.sdq.probfunction.LognormalDistribution;
import de.uka.ipd.sdq.probfunction.NormalDistribution;
import de.uka.ipd.sdq.probfunction.ProbabilityMassFunction;
import de.uka.ipd.sdq.probfunction.Sample;
import de.uka.ipd.sdq.probfunction.util.ProbfunctionSwitch;

public class ProbFunctionPrettyPrint extends ProbfunctionSwitch<String> {

    private static final int AVERAGE_PROBFUNCTION_LENGTH = 50;
    private final StringBuilder resultBuilder;
    private final static DecimalFormat df = new DecimalFormat("#0.0#######", new DecimalFormatSymbols(Locale.US));

    public ProbFunctionPrettyPrint() {
        this(new StringBuilder(AVERAGE_PROBFUNCTION_LENGTH));
    }

    public ProbFunctionPrettyPrint(final StringBuilder builder) {
        super();
        this.resultBuilder = builder;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * de.uka.ipd.sdq.probfunction.util.ProbfunctionSwitch#caseBoxedPDF(de.uka.ipd.sdq.probfunction
     * .BoxedPDF)
     */
    @Override
    public String caseBoxedPDF(BoxedPDF object) {
        resultBuilder.append("DoublePDF[");
        for (ContinuousSample s : object.getSamples()) {
            // double value = s.getProbability();
            // double precision = 0.00001;
            // Why needed as Decimal format rounds internally???
            // double precision = 0.00000001;

            // value *= 1 / precision;
            // long temp = Math.round(value);
            // double prob = temp * precision;
            resultBuilder.append(String.format("(%s; %s)", df.format(s.getValue()), df.format(s.getProbability())));
        }
        resultBuilder.append("]");
        return resultBuilder.toString();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * de.uka.ipd.sdq.probfunction.util.ProbfunctionSwitch#caseProbabilityMassFunction(de.uka.ipd
     * .sdq.probfunction.ProbabilityMassFunction)
     */
    @Override
    public String caseProbabilityMassFunction(ProbabilityMassFunction object) {
        Sample<?> sample = object.getSamples().get(0);

        String pmfType = detectType(sample);
        String leftSeparator = "";
        String rightSeparator = ";";

        if (pmfType.equals("EnumPMF")) {
            leftSeparator = "\"";
            rightSeparator = "\";";
        }

        resultBuilder.append(pmfType);
        resultBuilder.append("[");
        for (Sample<?> s : object.getSamples()) {
            resultBuilder.append(String.format("(%s%s%s %s)", leftSeparator, s.getValue(), rightSeparator,
                    df.format(s.getProbability())));
        }
        resultBuilder.append("]");
        return resultBuilder.toString();
    }

    @Override
    public String caseExponentialDistribution(ExponentialDistribution object) {
        resultBuilder.append(String.format("Exp(%s)", df.format(object.getRate())));
        return resultBuilder.toString();
    }

    @Override
    public String caseGammaDistribution(GammaDistribution object) {
        resultBuilder
                .append(String.format("Gamma(%s, %s)", df.format(object.getAlpha()), df.format(object.getTheta())));
        return resultBuilder.toString();
    }

    @Override
    public String caseLognormalDistribution(LognormalDistribution object) {
        resultBuilder.append(String.format("Lognorm(%s, %s)", df.format(object.getMu()), df.format(object.getSigma())));
        return resultBuilder.toString();
    }

    @Override
    public String caseNormalDistribution(NormalDistribution object) {
        resultBuilder.append(String.format("Norm(%s, %s)", df.format(object.getMu()), df.format(object.getSigma())));
        return resultBuilder.toString();
    }

    private String detectType(Sample<?> object) {
        if (object.getValue() instanceof Integer)
            return "IntPMF";
        if (object.getValue() instanceof Double)
            return "DoublePMF";
        if (object.getValue().equals("true") || object.getValue().equals("false")
                || object.getValue() instanceof Boolean)
            return "BoolPMF";
        if (object.getValue() instanceof String)
            return "EnumPMF";
        throw new UnsupportedOperationException("Unknown PMF found!");
    }
}
