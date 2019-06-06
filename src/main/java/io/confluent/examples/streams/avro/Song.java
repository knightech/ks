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
public class Song extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 9104070368042704268L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Song\",\"namespace\":\"io.confluent.examples.streams.avro\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"album\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"artist\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"genre\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Song> ENCODER =
      new BinaryMessageEncoder<Song>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Song> DECODER =
      new BinaryMessageDecoder<Song>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Song> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Song> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Song> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Song>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Song to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Song from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Song instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Song fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public long id;
  @Deprecated public java.lang.String album;
  @Deprecated public java.lang.String artist;
  @Deprecated public java.lang.String name;
  @Deprecated public java.lang.String genre;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Song() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param album The new value for album
   * @param artist The new value for artist
   * @param name The new value for name
   * @param genre The new value for genre
   */
  public Song(java.lang.Long id, java.lang.String album, java.lang.String artist, java.lang.String name, java.lang.String genre) {
    this.id = id;
    this.album = album;
    this.artist = artist;
    this.name = name;
    this.genre = genre;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return album;
    case 2: return artist;
    case 3: return name;
    case 4: return genre;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Long)value$; break;
    case 1: album = (java.lang.String)value$; break;
    case 2: artist = (java.lang.String)value$; break;
    case 3: name = (java.lang.String)value$; break;
    case 4: genre = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public long getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'album' field.
   * @return The value of the 'album' field.
   */
  public java.lang.String getAlbum() {
    return album;
  }


  /**
   * Sets the value of the 'album' field.
   * @param value the value to set.
   */
  public void setAlbum(java.lang.String value) {
    this.album = value;
  }

  /**
   * Gets the value of the 'artist' field.
   * @return The value of the 'artist' field.
   */
  public java.lang.String getArtist() {
    return artist;
  }


  /**
   * Sets the value of the 'artist' field.
   * @param value the value to set.
   */
  public void setArtist(java.lang.String value) {
    this.artist = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'genre' field.
   * @return The value of the 'genre' field.
   */
  public java.lang.String getGenre() {
    return genre;
  }


  /**
   * Sets the value of the 'genre' field.
   * @param value the value to set.
   */
  public void setGenre(java.lang.String value) {
    this.genre = value;
  }

  /**
   * Creates a new Song RecordBuilder.
   * @return A new Song RecordBuilder
   */
  public static io.confluent.examples.streams.avro.Song.Builder newBuilder() {
    return new io.confluent.examples.streams.avro.Song.Builder();
  }

  /**
   * Creates a new Song RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Song RecordBuilder
   */
  public static io.confluent.examples.streams.avro.Song.Builder newBuilder(io.confluent.examples.streams.avro.Song.Builder other) {
    if (other == null) {
      return new io.confluent.examples.streams.avro.Song.Builder();
    } else {
      return new io.confluent.examples.streams.avro.Song.Builder(other);
    }
  }

  /**
   * Creates a new Song RecordBuilder by copying an existing Song instance.
   * @param other The existing instance to copy.
   * @return A new Song RecordBuilder
   */
  public static io.confluent.examples.streams.avro.Song.Builder newBuilder(io.confluent.examples.streams.avro.Song other) {
    if (other == null) {
      return new io.confluent.examples.streams.avro.Song.Builder();
    } else {
      return new io.confluent.examples.streams.avro.Song.Builder(other);
    }
  }

  /**
   * RecordBuilder for Song instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Song>
    implements org.apache.avro.data.RecordBuilder<Song> {

    private long id;
    private java.lang.String album;
    private java.lang.String artist;
    private java.lang.String name;
    private java.lang.String genre;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.confluent.examples.streams.avro.Song.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.album)) {
        this.album = data().deepCopy(fields()[1].schema(), other.album);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.artist)) {
        this.artist = data().deepCopy(fields()[2].schema(), other.artist);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.name)) {
        this.name = data().deepCopy(fields()[3].schema(), other.name);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.genre)) {
        this.genre = data().deepCopy(fields()[4].schema(), other.genre);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing Song instance
     * @param other The existing instance to copy.
     */
    private Builder(io.confluent.examples.streams.avro.Song other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.album)) {
        this.album = data().deepCopy(fields()[1].schema(), other.album);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.artist)) {
        this.artist = data().deepCopy(fields()[2].schema(), other.artist);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.name)) {
        this.name = data().deepCopy(fields()[3].schema(), other.name);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.genre)) {
        this.genre = data().deepCopy(fields()[4].schema(), other.genre);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public long getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public io.confluent.examples.streams.avro.Song.Builder setId(long value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public io.confluent.examples.streams.avro.Song.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'album' field.
      * @return The value.
      */
    public java.lang.String getAlbum() {
      return album;
    }


    /**
      * Sets the value of the 'album' field.
      * @param value The value of 'album'.
      * @return This builder.
      */
    public io.confluent.examples.streams.avro.Song.Builder setAlbum(java.lang.String value) {
      validate(fields()[1], value);
      this.album = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'album' field has been set.
      * @return True if the 'album' field has been set, false otherwise.
      */
    public boolean hasAlbum() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'album' field.
      * @return This builder.
      */
    public io.confluent.examples.streams.avro.Song.Builder clearAlbum() {
      album = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'artist' field.
      * @return The value.
      */
    public java.lang.String getArtist() {
      return artist;
    }


    /**
      * Sets the value of the 'artist' field.
      * @param value The value of 'artist'.
      * @return This builder.
      */
    public io.confluent.examples.streams.avro.Song.Builder setArtist(java.lang.String value) {
      validate(fields()[2], value);
      this.artist = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'artist' field has been set.
      * @return True if the 'artist' field has been set, false otherwise.
      */
    public boolean hasArtist() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'artist' field.
      * @return This builder.
      */
    public io.confluent.examples.streams.avro.Song.Builder clearArtist() {
      artist = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.String getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public io.confluent.examples.streams.avro.Song.Builder setName(java.lang.String value) {
      validate(fields()[3], value);
      this.name = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public io.confluent.examples.streams.avro.Song.Builder clearName() {
      name = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'genre' field.
      * @return The value.
      */
    public java.lang.String getGenre() {
      return genre;
    }


    /**
      * Sets the value of the 'genre' field.
      * @param value The value of 'genre'.
      * @return This builder.
      */
    public io.confluent.examples.streams.avro.Song.Builder setGenre(java.lang.String value) {
      validate(fields()[4], value);
      this.genre = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'genre' field has been set.
      * @return True if the 'genre' field has been set, false otherwise.
      */
    public boolean hasGenre() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'genre' field.
      * @return This builder.
      */
    public io.confluent.examples.streams.avro.Song.Builder clearGenre() {
      genre = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Song build() {
      try {
        Song record = new Song();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0]);
        record.album = fieldSetFlags()[1] ? this.album : (java.lang.String) defaultValue(fields()[1]);
        record.artist = fieldSetFlags()[2] ? this.artist : (java.lang.String) defaultValue(fields()[2]);
        record.name = fieldSetFlags()[3] ? this.name : (java.lang.String) defaultValue(fields()[3]);
        record.genre = fieldSetFlags()[4] ? this.genre : (java.lang.String) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Song>
    WRITER$ = (org.apache.avro.io.DatumWriter<Song>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Song>
    READER$ = (org.apache.avro.io.DatumReader<Song>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.id);

    out.writeString(this.album);

    out.writeString(this.artist);

    out.writeString(this.name);

    out.writeString(this.genre);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.id = in.readLong();

      this.album = in.readString();

      this.artist = in.readString();

      this.name = in.readString();

      this.genre = in.readString();

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.id = in.readLong();
          break;

        case 1:
          this.album = in.readString();
          break;

        case 2:
          this.artist = in.readString();
          break;

        case 3:
          this.name = in.readString();
          break;

        case 4:
          this.genre = in.readString();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










