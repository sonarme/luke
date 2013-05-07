package org.getopt.luke;

import org.apache.lucene.search.Scorer;

import java.io.IOException;

public class NoScoringScorer extends Scorer {
  public static final NoScoringScorer INSTANCE = new NoScoringScorer();

  protected NoScoringScorer() {
    super(null);
  }

  @Override
  public float score() throws IOException {
    return 1.0f;
  }

  @Override
  public int advance(int doc) throws IOException {
    return 0;
  }

  @Override
  public int docID() {
    return 0;
  }

  @Override
  public int nextDoc() throws IOException {
    return 0;
  }

    /**
     * Returns term frequency in the current document.  Do
     * not call this before {@link #nextDoc} is first called,
     * nor after {@link #nextDoc} returns NO_MORE_DOCS.
     */
    @Override
    public int freq() throws IOException {
        return 1;
    }

    @Override
    public long cost() {
        return 0;
    }

}
