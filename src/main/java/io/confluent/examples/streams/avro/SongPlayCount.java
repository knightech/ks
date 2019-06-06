/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.confluent.examples.streams.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class SongPlayCount extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4452719225619238933L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SongPlayCount\",\"namespace\":\"io.confluent.examples.streams.avro\",\"fields\":[{\"name\":\"song_id\",\"type\":\"long\"},{\"name\":\"plays\",\"type\":\"long\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<SongPlayCount> ENCODER =
      new BinaryMessageEncoder<SongPlayCount>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<SongPlayCount> DECODER =
      new BinaryMessageDecoder<SongPlayCount>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<SongPlayCount> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<SongPlayCount> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<SongPlayCount> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<SongPlayCount>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this SongPlayCount to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a SongPlayCount from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a SongPlayCount instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static SongPlayCount fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public long song_id;
  @Deprecated public long plays;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public SongPlayCount() {}

  /**
   * All-args constructor.
   * @param song_id The new value for song_id
   * @param plays The new value for plays
   */
  public SongPlayCount(java.lang.Long song_id, java.lang.Long plays) {
    this.song_id = song_id;
    this.plays = plays;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return song_id;
    case 1: return plays;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: song_id = (java.lang.Long)value$; break;
    case 1: plays = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'song_id' field.
   * @return The value of the 'song_id' field.
   */
  public long getSongId() {
    return song_id;
  }


  /**
   * Sets the value of the 'song_id' field.
   * @param value the value to set.
   */
  public void setSongId(long value) {
    this.song_id = value;
  }

  /**
   * Gets the value of the 'plays' field.
   * @return The value of the 'plays' field.
   */
  public long getPlays() {
    return plays;
  }


  /**
   * Sets the value of the 'plays' field.
   * @param value the value to set.
   */
  public void setPlays(long value) {
    this.plays = value;
  }

  /**
   * Creates a new SongPlayCount RecordBuilder.
   * @return A new SongPlayCount RecordBuilder
   */
  public static io.confluent.examples.streams.avro.SongPlayCount.Builder newBuilder() {
    return new io.confluent.examples.streams.avro.SongPlayCount.Builder();
  }

  /**
   * Creates a new SongPlayCount RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new SongPlayCount RecordBuilder
   */
  public static io.confluent.examples.streams.avro.SongPlayCount.Builder newBuilder(io.confluent.examples.streams.avro.SongPlayCount.Builder other) {
    if (other == null) {
      return new io.confluent.examples.streams.avro.SongPlayCount.Builder();
    } else {
      return new io.confluent.examples.streams.avro.SongPlayCount.Builder(other);
    }
  }

  /**
   * Creates a new SongPlayCount RecordBuilder by copying an existing SongPlayCount instance.
   * @param other The existing instance to copy.
   * @return A new SongPlayCount RecordBuilder
   */
  public static io.confluent.examples.streams.avro.SongPlayCount.Builder newBuilder(io.confluent.examples.streams.avro.SongPlayCount other) {
    if (other == null) {
      return new io.confluent.examples.streams.avro.SongPlayCount.Builder();
    } else {
      return new io.confluent.examples.streams.avro.SongPlayCount.Builder(other);
    }
  }

  /**
   * RecordBuilder for SongPlayCount instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SongPlayCount>
    implements org.apache.avro.data.RecordBuilder<SongPlayCount> {

    private long song_id;
    private long plays;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.confluent.examples.streams.avro.SongPlayCount.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.song_id)) {
        this.song_id = data().deepCopy(fields()[0].schema(), other.song_id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.plays)) {
        this.plays = data().deepCopy(fields()[1].schema(), other.plays);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing SongPlayCount instance
     * @param other The existing instance to copy.
     */
    private Builder(io.confluent.examples.streams.avro.SongPlayCount other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.song_id)) {
        this.song_id = data().deepCopy(fields()[0].schema(), other.song_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.plays)) {
        this.plays = data().deepCopy(fields()[1].schema(), other.plays);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'song_id' field.
      * @return The value.
      */
    public long getSongId() {
      return song_id;
    }


    /**
      * Sets the value of the 'song_id' field.
      * @param value The value of 'song_id'.
      * @return This builder.
      */
    public io.confluent.examples.streams.avro.SongPlayCount.Builder setSongId(long value) {
      validate(fields()[0], value);
      this.song_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'song_id' field has been set.
      * @return True if the 'song_id' field has been set, false otherwise.
      */
    public boolean hasSongId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'song_id' field.
      * @return This builder.
      */
    public io.confluent.examples.streams.avro.SongPlayCount.Builder clearSongId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'plays' field.
      * @return The value.
      */
    public long getPlays() {
      return plays;
    }


    /**
      * Sets the value of the 'plays' field.
      * @param value The value of 'plays'.
      * @return This builder.
      */
    public io.confluent.examples.streams.avro.SongPlayCount.Builder setPlays(long value) {
      validate(fields()[1], value);
      this.plays = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'plays' field has been set.
      * @return True if the 'plays' field has been set, false otherwise.
      */
    public boolean hasPlays() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'plays' field.
      * @return This builder.
      */
    public io.confluent.examples.streams.avro.SongPlayCount.Builder clearPlays() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SongPlayCount build() {
      try {
        SongPlayCount record = new SongPlayCount();
        record.song_id = fieldSetFlags()[0] ? this.song_id : (java.lang.Long) defaultValue(fields()[0]);
        record.plays = fieldSetFlags()[1] ? this.plays : (java.lang.Long) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<SongPlayCount>
    WRITER$ = (org.apache.avro.io.DatumWriter<SongPlayCount>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<SongPlayCount>
    READER$ = (org.apache.avro.io.DatumReader<SongPlayCount>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.song_id);

    out.writeLong(this.plays);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.song_id = in.readLong();

      this.plays = in.readLong();

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.song_id = in.readLong();
          break;

        case 1:
          this.plays = in.readLong();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










