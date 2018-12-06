package de.fakeller.performance.analysis.result.metric;

import de.fakeller.performance.analysis.result.quantity.PerformanceQuantity;

/**
 * To be used for metrics that apply to a single point in time, such as the utilization of a certain resource at a
 * certain point in time.
 *
 * @param <Q>
 */
public class DirectMetric<Q extends PerformanceQuantity> extends AbstractPerformanceMetric<Q> implements SingularMetric<Q> {

    public final Q val;

    public DirectMetric(final Q value) {
        super((Class<Q>) value.getClass());
        this.val = value;
    }

    @Override
    public Q getMetric() {
        return this.val;
    }

    @Override
    public String toHumanReadable() {
        return this.val.toHumanReadable();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final DirectMetric<?> that = (DirectMetric<?>) o;

        return this.val.equals(that.val);

    }

    @Override
    public int hashCode() {
        return this.val.hashCode();
    }
}