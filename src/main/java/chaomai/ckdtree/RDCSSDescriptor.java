package chaomai.ckdtree;

/**
 * Created by chaomai on 11/10/15.
 */
public class RDCSSDescriptor<V> {
  InternalNode<V> ov;
  Node<V> ol;
  InternalNode<V> nv;
  volatile boolean committed = false;

  RDCSSDescriptor(InternalNode<V> ov, Node<V> ol, InternalNode<V> nv) {
    this.ov = ov;
    this.ol = ol;
    this.nv = nv;
    this.committed = false;
  }
}
