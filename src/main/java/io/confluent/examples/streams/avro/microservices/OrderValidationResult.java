/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.confluent.examples.streams.avro.microservices;
@org.apache.avro.specific.AvroGenerated
public enum OrderValidationResult implements org.apache.avro.generic.GenericEnumSymbol<OrderValidationResult> {
  PASS, FAIL, ERROR  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"OrderValidationResult\",\"namespace\":\"io.confluent.examples.streams.avro.microservices\",\"symbols\":[\"PASS\",\"FAIL\",\"ERROR\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
}
