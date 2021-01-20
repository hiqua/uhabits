package org.isoron.uhabits.core.database;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Table(name = "tests")
class ThingRecord
{
    @Column
    public Long id;

    @Column
    public String name;

    @Column(name = "color_number")
    public Integer color;

    @Column
    public Double score;

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ThingRecord record = (ThingRecord) o;

        return new EqualsBuilder()
            .append(id, record.id)
            .append(name, record.name)
            .append(color, record.color)
            .isEquals();
    }

    @Override
    public int hashCode()
    {
        return new HashCodeBuilder(17, 37)
            .append(id)
            .append(name)
            .append(color)
            .toHashCode();
    }

    @Override
    public String toString()
    {
        return new ToStringBuilder(this)
            .append("id", id)
            .append("name", name)
            .append("color", color)
            .toString();
    }
}
